#!/bin/bash
read n
cut -d: -f1 f1.txt | head -n5 | tail -n1
cut -d: -f1 f2.txt | head -n5 | tail -n1
cut -d: -f1 f3.txt | head -n5 | tail -n1
cut -d: -f1 f4.txt | head -n5 | tail -n1


