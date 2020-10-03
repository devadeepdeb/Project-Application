# Project-Application
LockedMe
<h1>Output</h1>
<h3>Code to display the welcome screen. It should display:</h3>
<h2>Output 1</h2>
<p>Main application window: Application name and the developer details</p>
<p>The details of the user interface such as options displaying the user interaction information</p>
<p>Features to accept the user input to select one of the 3 options listed.</p>
<p>The first option returns the current file names in ascending order. The root directory can be either empty or contain few files or folders in it.</p>
<img src="Images/1.PNG">
<h1>Output 2</h1>
<p>Business-level operations window:</p>
<p>Option to add a user specified file to the application</p>
<p>Option to delete a user specified file from the application</p>
<p>Option to search a user specified file from the application</p>
<p>Navigation option to close the current execution context and return to the main context</p>
<img src="Images/2.PNG">
<h1>Output 3</h1>
<p>Option to add a user specified file to the application and add contents to it.(Desktop.getDesktop().edit(file) opens the file for adding content on Notepad. It only works in Windows and not in linux OS).</p>
<img src="Images/3.PNG">
<h1>Output 4</h1>
<p>Delete a user specified file from the existing directory list</p>
<img src="Images/4.PNG">
<h1>Output 5</h1>
<p>Search a user specified file from the main directory</p>
<p>Displayed the result upon successful operation</p>
<p>Displayed the result upon unsuccessful operation</p>
<img src="Images/5.PNG">
<h1>Output 6</h1>
<p>Option to navigate back to the main context from Business Level Operation</p>
<img src="Images/6.PNG">
<h1>Output 7</h1>
<p>Third option to close the main application</p>
<img src="Images/7.PNG">
<h1>Application Algorithm</h1>
<p>1) Start</p>
<p>2) Welcome Screen to Print Application, Developer Name</p>
<p>3) Drive Menu comprising 3 Application options </p>
<p>4) Declare Scanner object to accept Application Menu  and declare String options </p>
<p>5) Is object value = 1,2,3?</p>
<p>6a) If No, return to 3) and continue.</p>
<p>6b) If Yes, Go to any step from 6b1)-6b3)</p>
<p>   6b1) Option 1 -> Display files in ascending order -> return to 3) and continue.</p>
<p>  6b2) Option 2 -> Business Operations comprising 4 options and go to 7)</p>
<p>  6b3) Option 3 -> Go to 10) end</p>
<p>7) Declare Scanner object to accept Business  Operations  and declare String options </p>
<p>8) Is object value = 1,2,3,4?</p>
<p>9a) If No, return to 6b2) and continue.</p>
<p>9b) If Yes, Go to any step from 9b1)-9b4)</p>
<p>   9b1) Option 1 -> Add file -> return to 6b2) and continue.</p>
<p>   9b2) Option 2 -> Delete file -> return to 6b2) and continue.</p>
<p>   9b3) Option 3 -> Search file -> return to 6b2) and continue.</p>
<p>   9b4) Option 4 -> Return to 3) and continue.</p>
<p>10) End</p>
<h1>Application Flowchart</h1>
<img src="Flowchart.PNG">
<h1>Core Concepts</h1>
<p>IDE : Eclipse Oxygen</p>
<p>Java Version: 1.8</p>
<p>Javs Concepts Used: Files, List, ArrayList, Interface, Static, Exception, If-else, Switch, Do-while, Scanner, Class, Function, Packages</p>