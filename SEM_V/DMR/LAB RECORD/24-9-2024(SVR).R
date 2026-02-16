#Changing Working Directory
getwd()
setwd("X:/SEM_V/DMR/LAB RECORD")
### 24-september-2024 ###
### DATA CLEANING ###

#Importing air quality dataset.

datasets::airquality

#Storing dataset into a variable.

demo <- datasets::airquality

#Printing data structure and names/types of columns.
str(demo)

#Summary of data

summary(demo)

#Checking Null values in specific columns

null_check <- is.na(demo)
View(null_check) #datatype is changed to boolean true = null value false = not null

#Displaying only where n/a= true cols 
null_values <- which(is.na(demo),arr.ind = TRUE)
View(null_values)

#Printing where N/A values are in columns
colSums(is.na(demo))

#Remove Null Values or N/A values
cleaned_data <- na.omit(demo)
View(cleaned_data)

#Replacing null values with mean values
null_replaced <- demo

null_replaced[]<- lapply(null_replaced,function(x) ifelse(is.na(x),mean(x,na.rm=TRUE),x))
View(null_replaced)

###########
#26-9-2024#
###########

#Replacing null with median

null_replace_median <- demo

null_replace_median[] <- lapply(null_replace_median,function(x) ifelse(is.na(x),median(x,na.rm=TRUE),x))

null_replace_median[]

#clear env and reset it
summary(demo)
demo
summary(airquality)
demo <- airquality
summary(demo)

#Replacing null values with nan values or a fixed values
#NaN can be replaced with a string or a number 
replace_with_nan <- demo
replace_with_nan[] <- lapply(replace_with_nan,function(x) ifelse(is.na(x),NaN,x))
replace_with_nan

remove_nan <- demo
remove_nan <- na.omit(remove_nan)
remove_nan
