int main(void){
int x,z,counter,limit,prime;
limit = 10001;
counter = 0;
x=z=2;
prime = 1;
	while(x > 0){
		z = 2;
		while(z < x){
		
			if( x % z == 0){
				prime = 0;
				break;
			}
			z++;
		}
		if(prime == 1){
			counter++;
		}
		
		if(counter == limit){
				break;
		}
	
		prime = 1;
		x++;
	}
	printf("%d", x);
	return 0;
}