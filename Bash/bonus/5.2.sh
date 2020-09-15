#!/bin/bash
max=$(cat  ./*.sh|wc -l)
wc -l ./*.sh |head -1 
echo $max
