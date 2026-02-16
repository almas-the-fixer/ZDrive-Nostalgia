data1 <- read.csv("X:/sem5 r dmr/groceries.csv")
data1

transaction <- as(data1,"transactions")
transaction

itemFrequencyPlot(transaction,topN=20)

rules = apriori(data1,parameter = list(sup = 0.001, conf = 0.8,minlen = 2, maxlen = 3))
inspect(rules[1:4])

plot(rules[1:4],method = "graph",engine = "htmlwidget")
