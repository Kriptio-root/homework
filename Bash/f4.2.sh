#!/bin/bash

x=0
y=0

x=$(cat /home/konstantin/dario/f4.2.1.txt | wc -l)
y=$(cat /home/konstantin/dario/f4.2.2.txt | wc -l)
if [ $x>$y ]
then
echo "f4.2.1.txt:"$x
echo "f4.2.2.txt:"$y
else
echo "f4.2.2.txt:"$y
echo "f4.2.1.txt:"$x
fi

echo $x
echo $y
