demo <- rpart::kyphosis
demo

library(randomForest)
sample1 = sample(81,61)

training_data = demo[sample1,]
testing_data = demo[-sample1,]


library(rpart)
library(rpart.plot)

#DECISIONTREE
dtm <- rpart(Kyphosis~.,training_data,method = "class")
rpart.plot(dtm,type = 2,extra = 102)

decisiontree_predict = predict(dtm,testing_data,type = "class")
decisiontree_predict

table(testing_data[,1],decisiontree_predict)#the [] value should be col number of labeled data e.g if labeled data is on 2nd col you should write table(datasetname[,2]) <<<<<
mean(testing_data[,1]==decisiontree_predict)
TST = data.frame(Age=14,Number=5,Start=13)
test_predict = predict(dtm,TST,type = "class")
test_predict
#RANDOMFOREST
rfm <- randomForest(Kyphosis~.,training_data,ntree=500)
rfm

predict1 = predict(rfm,testing_data)
predict1

importance(rfm)
