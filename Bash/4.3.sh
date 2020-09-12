#!/bin/bash
read text
echo $text> user
name=$(cut -d ' ' -f1 user)
del=$(cut -d ' ' -f2 user)
num=$(cut -d ' ' -f3 user)
$(cat /home/konstantin/dario/f4.2.1.txt | wc -l) 
f="f4.2.1.txt"
wc -l "$name"
clear
echo $del
echo $num
cut -d ${del} -f$num $name
