# Intercom
Hi,

The project is a console program written in Java. I used the IntelliJ IDE.
The entry point of the program is the 'main' function in the 'Main' class in the 'Main.java' file.
The 'main' function uses the 'CustomerScreener' class to get the list of invited customers and then prints the list.
'CustomerScreener' contains the logic of our task. It uses other classes in order to go over all the customers and check if they're not more than 100km away, and adds them to the invited list if that's true.
The 'CustomersNetworkFileRepository' class (in the Repositories folder) reads the customers file and provides an iterator that can iterate the customers.
The 'Customer' class (in the Models folder) holds the data of a customer. It also supports json serialization and de-serialization, and implements the 'Comparable' interface so we can easily sort the customers list.
The 'DistanceUtils' class (in the Utils folder) is where the function for calculating the distance between two coordinates is found.

Unit tests can be found in these files: 'DistanceUtilsTest.groovy', 'CustomersNetworkFileRepositoryTest.groovy' and 'CustomerScreenerTest.groovy', and can be run using the IntelliJ.
Execution explanation can be found in the 'How to execute.docx' I attached in the assignment submission.
I didn't add comments to the code, as I think it's self explanatory.

I don't handle wrong latitude or longitude values. It's possible to ignore the customer or change the values like done here:
https://developers.google.com/maps/documentation/javascript/reference/coordinates

Please let me know if I should add anything.

Thanks.
