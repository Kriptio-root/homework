#!/bin/bash

#read dir
#read row
#str=""

#cd $dir
#for f in $(ls -1)
#do
#head -$row $f >| tmp
#z=$(tail -1 tmp)
#str="$str $z"
#done
#echo $str

read files
read row
str=""
for f in $files
do
head -$row $f >| tmp
z=$(tail -1 tmp)
str="$str $z"
done
echo $str
