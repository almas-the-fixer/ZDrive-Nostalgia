getwd()
setwd("Z:/EM_V/DMR/LAB RECORD")
demo <- airquality

boxplot(demo$Ozone)
outliers <- boxplot.stats(demo$Ozone)$out
outliers
outlier_row <- which(demo$Ozone %in% outliers)
outlier_row


#Removing Outliers#

remove_outliers <- function(x){
  #calculating q1 and q3 and IQR#
  q1 <- quantile(x,0.25,na.rm = TRUE) #first quantile
  q3 <- quantile(x,0.75,na.rm = TRUE) #third quantile
  
  iqr <- IQR(x,na.rm = TRUE)
  
  #Getting lower and upper bounds
  lower_bound <- q1 - 1.5 * iqr
  upper_bound <- q1 + 1.5 * iqr
  
  #returning values outside of bounds and replacing them with NA values
  x[x < lower_bound |x > upper_bound] <- NA
  return(x)
}

demo_cleaned <- demo %>% mutate(across(where(is.numeric),remove_outliers))
print(demo_cleaned)
