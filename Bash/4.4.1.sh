sum=0
count=0
echo "enter file name,min and max"
read str
fname=$(echo $str | cut -d' ' -f 1)
min=$(echo $str | cut -d' ' -f 2)
max=$(echo $str | cut -d' ' -f 3)
while read x
do 
if [[$x -lt $min] || [$x -gt $max]]
then
continue
fi
sum=$[$sum+$x]
count=$[$count+1]
done < $fname
echo "sum: " $sum
echo "count: " $count
