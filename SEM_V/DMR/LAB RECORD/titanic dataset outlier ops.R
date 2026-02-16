d1 <- datasets::Titanic
View(d1)
class(d1) # viewing data structure of this dataset
str(d1) #alternate way

#convert table into data frame

d2 <- as.data.frame(d1)

s1 <- d2[1:4] <- sapply(d2[1:4],as.numeric)
class(s1)
s1
