#LOGISTIC RGRESSION

View(Titanic)
print(Titanic)
data.frame(Titanic)

library(caTools)
demo <- as.data.frame(Titanic)

split <- sample.split(Titanic, SplitRatio = 0.8)
split

train_reg <- subset(demo,split == TRUE)
dim(train_reg)
test_reg <- subset(demo,split == FALSE)
dim(test_reg)

logistic_model <- glm(Survived ~ Class + Age + Sex,data = train_reg,family = "binomial")
logistic_model
summary(logistic_model)

predict_reg <- predict(logistic_model,data=test_reg)
predict_reg

table(test_reg$vs)