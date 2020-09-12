#!/bin/bash
read text
echo $text> user1
name=$(cut -d ' ' -f1 user1)
start=$(cut -d ' ' -f2 user1)
end=$(cut -d ' ' -f3 user1)
cut -d_ -f1- $name
clear
head -n $start $name | tail -n $end


