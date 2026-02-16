getwd()
setwd("X:/SEM _ V/DMR/LAB RECORD")
getwd()

library(MASS)

data("airquality")

'z_score_threshold <- 3
airquality$z_score <- (airquality$Ozone - mean(airquality$Ozone))/sd(airquality$Ozone)
airquality$z_score
airquality <- airquality[abs(airquality$z_score) <= z_score_threshold,]
'

data('Boston')

z_scores <- (Boston$medv - mean(Boston$medv))/sd(Boston$medv)
z_scores

outliers <- Boston[abs(z_scores)>3,]
outliers



