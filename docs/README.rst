.. PayStubV2 documentation master file, created by
   sphinx-quickstart on Mon Apr  6 09:46:07 2020.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

Welcome to PayStubV2's documentation!
=====================================

.. image:: /images/money-banner.jpeg 

.. toctree::
   :maxdepth: 2
   :hidden:

   introduction
   prerequisites
   directions
   troubleshooting

* `Introduction`_
* `Prerequisites`_
* `Directions for using PayStubV2`_
* `Troubleshooting PayStubV2`_
* `Contribute to PayStubV2`_
* `License`_
   
Introduction
======================

----------------------
What is PayStubV2
----------------------

PayStubV2 is a user-friendly program that enables a user to create any number of paystubs. This program can be used for work purposes or it can be used at your leisure as a forecasting tool to visualize potential pay. This tutorial shows you how to optimize the use of PayStubV2.

`View this project on Github <https://github.com/lylesma/Sample-Work>`_

.. figure:: /images/image1.jpg 

    PayStubV2 running in BlueJ IDE (Integrated Development Environment)

Prerequisites
==============

-----------------
To use PaystubV2:
-----------------

* You must have a computer with a terminal

* You must have a computer with a Java compiler installed.

.. note:: If you do not have a Java compiler you can visit this site http://www.cs.utah.edu/~alee/cs51/penv/installJava

How to run PayStubV2 in command prompt:

1. Press the windows button and R key simultaneously.

2. Type cmd.exe in the open field. 

* If that doesn’t work, then consider opening the command prompt from the start menu. 

.. figure:: /images/image2.jpg 

    (Successfully completing steps 1 and 2 will render this window)

3. Use cd command to modify working directory.

* If you want to navigate to the Sample folder within your Downloads folder, enter cd Downloads\Sample.
* You can see what is in the current directory by typing dir and pressing enter.

.. figure:: /images/image3.jpg 

    (Successfully completing step 3 will render this window)

4.	Compile the program by typing javac filename.java in the command line. 

5.	Press enter

* During this process, if any errors are detected the command prompt will let you know.

.. figure:: /images/image4.jpg 

    (This should be what your window looks like after completing steps 4 and 5)

6.	Now that the program is compiled, run the program by typing java filename.java.

7.	Press enter

.. figure:: /images/image5.jpg 

    (This should be what your window looks like after completing steps 6 and 7)

Directions for using PayStubV2
===============================

Now that you’ve opened the program PayStubV2 in the command prompt, you are on your way to obtaining a paystub. 

1.	Enter the employee’s name.

.. note:: Numbers can be entered in the name field, but it’s better to use just words.

.. figure:: /images/image6.jpg 

    (“John” is entered in the field and the program jumps to the next field)

2.	Enter the employee’s social security number.

* Words can be entered in the social security number field, but it’s better to use just numbers and dashes.
* It’s recommended that you don’t use your actual social security number. Instead, you can simply enter a value like 111-11-1111.

.. figure:: /images/image7.jpg

    (“111-11-1111” is entered in the field and the program jumps to the next field)

3.	Enter the number of regular hours worked.

.. note:: A common value for hours worked per week is for 40 hours but entering an amount that applies to you will give you a better prediction.

.. figure:: /images/image8.jpg


    (“40” is entered in the field and the program jumps to the next field)

4.	Enter the number of overtime hours worked.

.. note:: If you did not work overtime hours, then this field is not applicable so you can simply enter zero.

.. figure:: /images/image9.jpg

    (“0” is entered in the field and the program jumps to the next field)

5.	Enter hourly pay rate.

.. note:: For example, if you earn $12.25 an hour then you would enter twelve dot twenty five (12.25).

.. figure:: /images/image10.jpg

    (“12.25” is entered in the field and the program jumps to the next field)

Now, the program branches into questions about overtime rate, social withholding, and federal tax. 

* The default value of overtime rate is set to time and a half and to enumerate that we use the value 1.5.
* The default value of social withholding is set to ten percent and to enumerate that we use the value 0.1.
* The default value of federal tax is set to twenty percent and to enumerate that we use the value 0.2.

You as a user have the capability to change each of these fields to replicate your situation.

6.	Enter yes/no to change the overtime rate. If you want to keep the rate at its default value of 1.5, change nothing.

.. figure:: /images/image11.jpg

    (“no” is entered in the field so the default overtime value remains the same)

7.	Enter yes/no to change the social withholding rate. If you want to keep the rate at its default value of 0.1, change nothing.

.. figure:: /images/image12.jpg

    (“no” is entered in the field so the default social withholding value remains the same)

8.	Enter yes/no to change the federal tax rate. If you want to keep the rate at its default value of 0.2, change nothing.

.. figure:: /images/image13.jpg

    (“no” is entered in the field so the default federal tax value remains the same)

Your Paystub should display now! Now, you are prompted to enter another pay rate so that you can compare gross pay. 

9.	Enter a new hourly pay rate.

.. figure:: /images/image14.jpg

    (“13.00” is entered in the new gross pay field)

Your new gross pay will display!

.. note:: If your new pay rate was greater than your previous pay than your gross pay should be greater than your previous gross pay. If your new pay was less than your previous pay than your gross pay should be less than your previous gross pay.

10.	Enter a positive integer to continue creating paystubs or enter zero to exit.

.. figure:: /images/image15.jpg

    (“0” is entered in the field to terminate the program)

Troubleshooting PayStubV2
===============================

If there are any issues, email me at lylesma@appstate.edu

Contribute to PayStubV2
========================

Source code locate `here <https://github.com/lylesma/PayStubV2>`_

Feel free to submit a pull request!

License
===============================

`MIT <http://choosealicense.com/licenses/mit/>`_