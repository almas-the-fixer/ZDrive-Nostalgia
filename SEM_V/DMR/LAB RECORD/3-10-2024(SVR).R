#Demo dataset iris
iris_demo <- datasets::iris
#Boxplotting to find outliers
boxplot(iris_demo)
#Using boxplots.stats to find values of outliers
outlier_values <- boxplot.stats(iris_demo$Sepal.Width)$out
outlier_values

#Now we got the values of outliers lets finf index of those values
index_outliers <- which(iris_demo$Sepal.Width %in% outlier_values)
index_outliers

#Replacing outliers with N/A values
iris_outliers <- iris_demo
iris_outliers[index_outliers,"Sepal.Width"] <- NA
iris_outliers

#Replacing using lower and upper bounds
replace_outliers <- function(x){
  q1 <- quantile(x,0.25,na.rm = TRUE)
  q3 <- quantile(x,0.75,na.rm = TRUE)
  iqr <- IQR(x,na.rm = TRUE)
  
  lower_bound<- q1 - 1.5 * iqr
  upper_bound<- q3 + 1.5 * iqr
  
  x[x< lower_bound | x > upper_bound] <- NA ##<<--- to replace with mean write mean(datasetname$colname)
  return(x) 
}

replace_outliers_with_mean <- function(x){
  q1 <- quantile(x,0.25,na.rm = TRUE)
  q3 <- quantile(x,0.75,na.rm = TRUE)
  iqr <- IQR(x,na.rm = TRUE)
  
  lower_bound<- q1 - 1.5 * iqr
  upper_bound<- q3 + 1.5 * iqr
  
  x[x< lower_bound | x > upper_bound] <- mean(iris_demo$Sepal.Width) ##<<--- to replace with mean write mean(datasetname$colname)
  return(x) 
}

cleaned_data <- iris_demo %>% mutate(across(where(is.numeric),replace_outliers))
cleaned_data


replaced_data <- iris_demo %>% mutate(across(where(is.numeric),replace_outliers_with_mean))
replaced_data
summary(iris_demo)



