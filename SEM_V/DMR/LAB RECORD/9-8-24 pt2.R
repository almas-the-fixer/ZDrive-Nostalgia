library(MASS)

data("Boston")

q1_Boston <- quantile(Boston$medv,0.25)
q3_Boston <- quantile(Boston$medv,0.75)

iqr_Boston <- q3_Boston - q1_Boston 

lower_fence_boston <- q1_Boston - 1.5* iqr_Boston
upper_fence_boston <- q3_Boston + 1.5* iqr_Boston

abc <- Boston[!(Boston$medv < lower_fence_boston | Boston$medv > upper_fence_boston),]
abc


