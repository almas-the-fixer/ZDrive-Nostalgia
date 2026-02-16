#Select specific Column
head(select(iris,Sepal.Length))

#De-Select specific column
head(select(iris,-Sepal.Length))

#Selecting 1st column
head(select(iris,1))

#Select Feature by pattern match by typing first 3 or last 3 letters of column name
head(select(iris,starts_with("Sep")))

#Same with last 3 letters
head(select(iris,ends_with("gth")))

#filter by condition
filter(iris,Sepal.Length > 7)

#Adds new Column 
mutate(iris,Sepal.Length * Sepal.Width)

########################################################################
#Plotting#

#storing sum of cols into variable
#removed 5th col because its text and cannot be summed
data_barplot <- colSums(iris[-5])

#plotting barplot
barplot(data_barplot, main = "Iris barplot", xlab = "Column", ylab = "Sum", col = rainbow(4),legend.text = colnames(iris[-5]))

#plotting avg values of columns
avg_iris <- colMeans(iris[-5])
barplot(avg_iris, main = "Iris barplot", xlab = "Column", ylab = "Mean", col = rainbow(4),legend.text = colnames(iris[-5]))


#Excercise

plt_data <- select(iris,1:2)
filtered_data <- filter(plt_data, Sepal.Length > 7, Sepal.Width > 3)
dt1 <- colMeans(filtered_data)

barplot(dt1,main = "Sepal.Length vs Sepal.Width",xlab = "Sepal.length", ylab = "Sepal.Width", col = rainbow(2))
boxplot(dt1, main = "Mean of sepal length and width", xlab = "sepal.length", ylab = "sepal.width", col = rainbow(2))
