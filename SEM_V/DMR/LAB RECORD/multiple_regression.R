demo = read.csv("a:/data.csv")
demo
print(demo)
demo$State = factor(demo$State,
                    levels = c('New York','California','Florida'),
                    labels = c(1,2,3))
state_factored <- demo$State
library(caTools)

mul_sample  <- sample(10,8)

train <- demo[mul_sample,]
test <- demo[-mul_sample,]

split = sample.split(demo$Profit,SplitRatio = 0.8)
training_set = subset(demo,split==TRUE)
test_set = subset(demo,split==FALSE)

multi_regression = lm(formula =Profit~.,data = train)

y_pred = predict(multi_regression,test)
y_pred

plot(demo$Profit,demo$Marketing.Spend,
     abline(lm(demo$Profit~demo$R.D.Spend+demo$Administration+demo$Marketing.Spend+demo$State)),
     xlab="Marketing spnd",
     ylab="Profit")

new_data <- data.frame(R.D.Spend = 150000,Administration = 120000,Marketing.Spend = 100000,State = "1")
new_data

predict(multi_regression,newdata=new_data)
