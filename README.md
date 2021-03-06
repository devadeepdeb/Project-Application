# Project-Application
LockedMe Application with hardcoded Root Directory to perform File Operations
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
<p>Option to add a user specified file to the application and add contents to it.(Desktop.getDesktop().edit(file) opens the file for adding content on Notepad. It only works in Windows and not in linux OS).Please comment (Desktop.getDesktop().edit(file) and remove dependent imported packages if you are testing in Linux OS.</p>
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
<h2>Output 8</h2>
<p>Below is invalid option entered in main menu and it shows invalid input to user to proceed once again</p>
<img src="Images/8.PNG">
<h2>Output 9</h2>
<p>Below is invalid option entered in Business operations menu and it shows invalid input to user to proceed once again</p>
<img src="Images/9.PNG">
<h2>Output 10</h2>
<p>Below is invalid option entered in 2nd operation i.e. add new file in Business operations menu and if user enters invalid input to user to proceed once again in Business Operations Menu. Only text file is allowed for adding files.</p>
<p>Note: Add new file is ignoring Case Sensitivity (e.g. if we enter abc.txt, Abc.txt both will be allowed to add. However only first created file will be observed in Root Directory if we are working on IDE in Windows in this case. Whereas both files will be allowed if work in IDE using Linux.)</p>
<img src="Images/10.PNG">
<h2>Output 11</h2>
<p>Option to add a user specified text file to the application and add contents to it.(Desktop.getDesktop().edit(file) opens the file for adding content on Notepad. It only works in Windows and not in linux OS). Please comment (Desktop.getDesktop().edit(file) and remove dependent imported packages if you are testing in Linux OS.</p>
<img src="Images/11.PNG">
<h2>Output 12</h2>
<p>Option to delete a user specified text file from the application and it is following Case sensitivity for a file strictly to delete.</p>
<img src="Images/12.PNG">
<h2>Output 12</h2>
<p>Option to search a user specified text file alongwith content if applicable from the application and it is following Case sensitivity for a file strictly to search.</p>
<img src="Images/13.PNG">
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
<p>In first week, I have installed Eclipse IDE, Git Bash and created WelcomePage java file, FileInterface java file, AppMenu java file with modifications and compilations to test initial prototype in IDE.</p>
<p>In second week, I have created Github account, BusinessOperations java file, AppMain java file with modifications, integrations and compilations to test final application for delivery and then pushed source code to GitHub via Git Bash with documentation.</p>
<h1>Core Concepts</h1>
<p>IDE : Eclipse Oxygen</p>
<p>Command Line Emulator Used: Git Bash 2.28.0 version</p>
<p>Git repository hosting service: GitHub</p>
<p>Operating System: Windows 10</p>
<p>Java Compiler Version: 1.8</p>
<p>Java Concepts Used: Files, List, ArrayList, Interface, Static, Exception, If-else, Switch, Do-while, Scanner, Class, Function, Packages</p>
<h1>Data Structures</h1>
<p>Sequential Search: In this, the list or array  (here a list of files) is traversed sequentially and every element is checked. In this application Linear Searching is used to search files in direcotories.</p>
<p>Sorting: I have used arraylist.add() to get filenames via for-each loop to get them in increasing order.</p>
<h1>Conclusion</h1>
<p>Application can be enhanced further if it accepts user inputs to create directory to perform Business Operations rather than using hardcoded Root directory.</p>