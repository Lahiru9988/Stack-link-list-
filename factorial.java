
int factorial(int n){ //factirial of a number
    if(n == 0)
        return 1;
    else
        return n * factorial(n-1);
}
//factorial(5) = 5 * 4 * 3 * 2 * 1 = 120