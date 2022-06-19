//insertion-sort
for j =2 to A.length
    key = A[j]  //key is the value to be inserted
    i = j-1
    while i>0 and A[i]>key
        A[i+1] = A[i]
        i = i-1
        A[i+1] = key
    end while