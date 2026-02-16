#For ROC Curve to Evaluate Model
#install.packages("ROCR")
#Loading Package
library("caTools")
library("ROCR")
#Splitting Data set
split1 <- sample.split(mtcars, SplitRatio = 0.8)
split1
train_reg <- subset(mtcars, split1 == TRUE)
test_reg <-subset(mtcars, split1 == FALSE)
#second method to split the data into train_data and test_data
split2<-sample(32,25)
train_data <- mtcars[split2,]
test_data<-mtcars[-split2,]
#Training Model
logistic_model <- glm(vs ~ wt + disp,
                      data = train_reg,
                      family = "binomial")
logistic_model
#Summary
summary(logistic_model)
predict_reg <- predict(logistic_model,
                       test_reg, type = "response")
predict_reg
#Changing Probabilities
predict_reg <- ifelse(predict_reg >0.5, 1, 0)
predict_reg
#Evaluating Model Accuracy Using Confusion Matrix
table(test_reg$vs, predict_reg)
missing_classerr <-mean(predict_reg !=test_reg$vs)
missing_classerr
print(paste('Accuracy =',1 - missing_classerr))
#ROC-AUV Curve
ROCPred <- prediction(predict_reg,test_reg$vs)
ROCper <- performance(ROCPred, measure = "tpr",x.measure = "fpr")
auc <- performance(ROCPred, measure = "auc")
auc <- auc@y.values[[1]]
auc
#Plotting Curve
plot(ROCper)
plot(ROCper, colorize = TRUE,
     print.cutoffs.at = seq(0.1, by = 0.1),
     main = "ROC CURVE")
abline(a = 0, b = 1)
auc <- round(auc, 4)
legend(.6, .4, auc, title = "AUC", cex = 1)