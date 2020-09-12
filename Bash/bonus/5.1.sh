#!/bin/bash
echo "please enter low num"
read x
echo "enter the great num"
read y
echo "enter the shift num"
read f
z=$x
string=""
if [ $x -gt $y ]
then
echo "enter low num frist!"
elif [ $x -lt $y ]
then
while [ $z -lt $y ]
do
string="$string$z@@"
z=$[z+f]
done
fi

echo $string
