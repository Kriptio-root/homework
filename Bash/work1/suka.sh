#!/bin/bash

head -5 customers.csv
echo " "
echo "Press y to clear console"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi
tail -6 customers.csv
echo " "
echo "Press y to clear console n to skip"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi
head -2 customers.csv
tail -1 customers.csv
echo " "
echo "Press y to clear console"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi
head -6 customers.csv | cut -d ',' -f 2
echo " "
echo "Press y to clear console"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi
tail -7 customers.csv | cut -d ',' -f 2,8
echo " "
echo "Press y to clear console"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi
#grep -o '^.*Ms.^*,' customers.csv
#echo " "
#echo "Press y to clear console"
#echo " "
#read x
#if [ $x == 'y' ]
#then
#clear
#fi
grep -w "Ms." customers.csv | cut -d"," -f2 > ms.txt
echo " "
echo "Press y to clear console"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi
grep -w "Mr." customers.csv  | cut -d"," -f2 >  mr.txt
echo " "
echo "Press y to clear console"
echo " "
read x
if [ $x == 'y' ]
then
clear
fi

