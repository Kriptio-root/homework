#!/bin/bash
echo "please enter low num"
read x
echo "enter the great num"
read y
z=$x
string=""
if [ $x -gt $y ]
then
echo "enter low num frist!"
elif [ $x -lt $y ]
then
while [ $z -lt $y ]
do
string="$string$z%%"
z=$[z+x]
done
fi

echo $string
