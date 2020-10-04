# Project-Application
LockedMe
<h1>Project Overview</h1>
<pre>
LockedMe is an Application implementing File Generic features and three operations:

1) Retrieving the file names in an ascending order
2) Business-level operations:
   a) Option to add a user specified file to the application
   b) Option to delete a user specified file from the application
   c) Option to search a user specified file from the application
   d) Navigation option to close the current execution context and return to the main context
3) Option to close the application
</pre>
<h1>Project Github Repository url</h1>
https://github.com/devadeepdeb/Project-Application
<h1>Output</h1>
<h3>Code to display the welcome screen. It should display:</h3>
<h2>Output 1</h2>
<p>Main application window: Application name and the developer details</p>
<p>The details of the user interface such as options displaying the user interaction information</p>
<p>Features to accept the user input to select one of the 3 options listed.</p>
<p>The first option returns the current file names in ascending order. The root directory can be either empty or contain few files or folders in it.</p>
<img src="Images/1.PNG">
<h2>Output 2</h2>
<p>Business-level operations window:</p>
<p>Option to add a user specified file to the application</p>
<p>Option to delete a user specified file from the application</p>
<p>Option to search a user specified file from the application</p>
<p>Navigation option to close the current execution context and return to the main context</p>
<img src="Images/2.PNG">
<h2>Output 3</h2>
<p>Option to add a user specified file to the application and add contents to it.(Desktop.getDesktop().edit(file) opens the file for adding content on Notepad. It only works in Windows and not in linux OS).</p>
<img src="Images/3.PNG">
<h2>Output 4</h2>
<p>Delete a user specified file from the existing directory list</p>
<img src="Images/4.PNG">
<h2>Output 5</h2>
<p>Search a user specified file from the main directory</p>
<p>Displayed the result upon successful operation</p>
<p>Displayed the result upon unsuccessful operation</p>
<img src="Images/5.PNG">
<h2>Output 6</h2>
<p>Option to navigate back to the main context from Business Level Operation</p>
<img src="Images/6.PNG">
<h2>Output 7</h2>
<p>Third option to close the main application</p>
<img src="Images/7.PNG">
<h1>Application Algorithm</h1>
<pre>
1) Start
2) Welcome Screen to Print Application, Developer Name
3) Drive Menu comprising 3 Application options
4) Declare Scanner object to accept Application Menu  and declare String options
5) Is object value = 1,2,3?
6a) If No, return to 3) and continue.
6b) If Yes, Go to any step from 6b1)-6b3)
   6b1) Option 1 -> Display files in ascending order -> return to 3) and continue.
  6b2) Option 2 -> Business Operations comprising 4 options and go to 7)
  6b3) Option 3 -> Go to 10) end
7) Declare Scanner object to accept Business  Operations  and declare String options
8) Is object value = 1,2,3,4?
9a) If No, return to 6b2) and continue.
9b) If Yes, Go to any step from 9b1)-9b4)
   9b1) Option 1 -> Add file -> return to 6b2) and continue.
   9b2) Option 2 -> Delete file -> return to 6b2) and continue.
   9b3) Option 3 -> Search file -> return to 6b2) and continue.
   9b4) Option 4 -> Return to 3) and continue.
10) End
</pre>
<h1>Application Flowchart</h1>
<img src="Flowchart.PNG">
<h1>Agile Framework</h1>
<p>I have used Agile Scrum Methodology to deliver this Application taking 2 Sprints, considering 1 Sprint per week.</p>
<p>In first week, I have created Welcome Page, FileInterface, AppMenu java files with modifications and compilations to test prototype.</p>
<p>In second week, I have created BusinessOperations, AppMain java files with modifications, integrations and compilations to test final application for delivery.</p>
<h1>Core Concepts</h1>
<p>IDE : Eclipse Oxygen</p>
<p>Java Compiler Version: 1.8</p>
<p>Java Concepts Used: Files, List, ArrayList, Interface, Static, Exception, If-else, Switch, Do-while, Scanner, Class, Function, Packages</p>
<h1>Conclusion</h1>
<p>Application can be enhanced further if it accepts user inputs to create directory to perform Business Operations rather than using hardcoded Root directory.</p>