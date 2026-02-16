head(cars)
dim(cars)

car_sample <- sample(50,40)
train_data <- cars[car_sample,]
testdata <- cars[-car_sample,]
dim(train_data)
dim(testdata)

linearModel <- lm(dist ~ speed, data = train_data)
print(linearModel)

summary(linearModel)

cars_prediction <- predict(linearModel,testdata)
cars_prediction

plot(cars$dist,cars$speed,col="red",
     main="Cars Regression",
     abline(lm(cars$dist~cars$speed)),
     cex=1.3,pch=16,
     xlab="Speed",
     ylab="Distance")
new_data <- data.frame(speed=4)
new_prediction <- predict(linearModel,newdata= new_data)
new_prediction
