data <- datasets::iris

sample1 <-sample(150,100)
training_data = iris[sample1,]

dim(training_data)
head(training_data)

testing_data = iris[-sample1,]
dim(testing_data)
head(testing_data)

data_model <- rpart(Species~.,data = training_data,method = "class")
data_model

rpart.plot(data_model,type = 2,extra = 102)
#Predicting

prediction <- predict(data_model,testing_data,type = "class")

#Checking Accuracy
table(testing_data[,5],prediction)
#Checking Accuracy percentage
mean(testing_data[,5]==prediction)

#Testing with a new data
new_data <- data.frame(Sepal.Length=5.0,Sepal.Width=3.9,Petal.Length=2.6,Petal.Width=0.4)

new_data_prediction<- predict(data_model,new_data,type = "class")
new_data_prediction

Sepal.Length <- c(1.8,1.9,2.5,2.7,2.6)
Sepal.Width <- c(0.5,0.6,0.3,0.6,0.7)
Petal.Length <- c(1.9,2.3,2.5,2.7,2.8)
Petal.Width <- c(1.5,1.8,1.9,1.8,0.7)

test2 = data.frame(Sepal.Length,Sepal.Width,Petal.Length,Petal.Width)

#predicting on these 5 rows

prediction2 <- predict(data_model,test2,type="class")
prediction2
class(prediction2)
result<-as.data.frame(prediction2)
class(result)
