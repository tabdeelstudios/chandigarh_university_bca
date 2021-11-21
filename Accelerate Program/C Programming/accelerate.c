/*

Write a C Program for a Bike Rental application.
The user should be able to perform the following tasks:
	- Create a new account by entering their email
	- See the list of available bikes
	- Book a bike
	- See all bookings
	
*/

#include<stdio.h>

//Function prototypes
void createAccount(char[]);
void showBikes();

void main()
{
	//Declare all variables
	int choice;
	char email[20];
	
	//Show the menu to the user
	do{
		printf("--------------------\nChoose one : \n1. Create a new account by entering their email\n2. See the list of available bikes\n3. Book a bike\n4. See all bookings\n------------------------\n");
		//Read the choice
		scanf("%d", &choice);

		switch(choice)
		{
			case 1 :printf("Enter your email to create account : ");
				 	scanf("%s", email);
					createAccount(email);
					 break;
			case 2 : showBikes();
					 break;
//			case 3 : bookBike();
//					 break;
//			case 4 : showBookings();
//					 break;
			default : printf("\nThanks for shopping with us!");
		}
	}while(choice>=1 && choice<=4);

}


//Create account function
void createAccount(char email[]){
	printf("\nYour account is created!\nYour login email is : %s\n", email);
}

//List of bikes function
void showBikes()
{
	int i,j;
	int bikeMileage[]={50,55,60};
	char bikeName[]={'H', 'S', 'Y'};
	for(i = 0; i<3;i++)
	{
		printf("Mileage : %d\t", bikeMileage[i]);
		printf("\n");
		printf("Brand : %c\t", bikeName[i]);
	}
}

//Book a bike function


//See all bookings function













