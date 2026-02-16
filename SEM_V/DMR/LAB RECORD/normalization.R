#Normalization#
#Min-Max Normalizaton#

df <- data.frame(col1 = c(10,12,15,14,13,102,11,14),
                 col2 = c(100,200,300,400,500,600,700,800))
df %>% mutate(across(everything(),~(.-min(.))/(max(.)-min(.))))

#Z score formula --> x-mean(.)/sd(.)

z_score_normalization <- df %>% mutate(across(everything(),~(.-mean(.))/(sd(.))))
print(z_score_normalization)
 
mean(df$col1)
sd(df$col1)

#Decimal Scaling Normalization

decimal_scaling <- function(x){
  scaling_factor <- 10 ^ ceiling(log10(max(abs(x))))
  return(x / scaling_factor)
}

df_decimal_scaling <- df %>% mutate(across(everything(),decimal_scaling))
df_decimal_scaling
