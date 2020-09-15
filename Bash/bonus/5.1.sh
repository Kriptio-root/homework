#!/bin/bash
echo "please enter low num"
read x
echo "enter the great num"
read y
echo "enter the shift num"
read f
z=$x
string=""
if [ $f -lt 0 ]
then
while [ $z -lt $y ]
do
string="$string$z@@"
z=$[z-f]
done
fi
if [ $f -gt 0 ]
then
while [ $z -lt $y ]
do
string="$string$z@@"
z=$[z+f]
done
fi
if [ $x -gt $y ]
then
echo "pablo stom"
while [ $z -gt $y ]
do
echo "amarti leha stom"
string="$string$z@@"
z=$[z+f]
done
fi
echo $string
