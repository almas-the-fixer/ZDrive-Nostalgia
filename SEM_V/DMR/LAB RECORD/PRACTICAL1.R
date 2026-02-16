getwd()
setwd("C:/Users/Administrator/Desktop")
getwd()

list.files()
setwd("C:/Users/Administrator/Desktop/DMR")

getwd()

list.files()

file.create("Abc.txt")
file.rename("Abc.txt","Demo.txt")

list.files()
write.table("Hello World",file = "Demo.txt", sep = "")
read.table("Demo.txt")
file.create("Demo2.txt")
write.table("Demo2 File",file = "Demo2.txt", sep = "")
file.append("Demo.txt","Demo2.txt")
mydata = "This is Some Text"

write.table(mydata,file = "Demo2.txt",sep = "")
read.table("Demo2.txt")
file.remove("Demo2.txt")
