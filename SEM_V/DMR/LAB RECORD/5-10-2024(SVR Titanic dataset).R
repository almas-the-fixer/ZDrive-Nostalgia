demo_titanic <- datasets::Titanic
# It is in tabular format
class(demo_titanic)
#Converting into data frame
d1_titanic <- as.data.frame(demo_titanic)
class(d1_titanic)
View(d1_titanic)

#Converting into numeric Format
d2_titanic <- sapply(d1_titanic,as.numeric)
class(d2_titanic)
d2_titanic

