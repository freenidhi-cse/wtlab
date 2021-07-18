#Week 5

##Validating the XML file against its Schema (.xsd) 

1. Download Notepad++. In the navigation bar, click on Plugins > Plugins Admin. Search for "XML Tools" and install it.
2. After the installation is done, close Notepad++ and open it again. Go to Plugins > XML Tools > Enable Auto Validation ( click this ).
3. Now, you can use the .xml and .xsd files from this folder and create your own and load them into Notepad++. When you make changes to the XML file which go against the rules specified in the .xsd ( schema ) file, Notepad++ immediately gives you details about the error and its position.
4. Accordingly, after you make corrections, if your XML file has no errors w.r.t the .xsd ( schema ) file, when you save the file, you'll see a dialog box with the message "No errors found".

##Deploying XSL Files on your device 

Unlike HTML/CSS files, we cannot open XML files formatted with XSLT ( .xsl files ) directly in a browser because of local file display errors raised by browsers. Hence, this cannot be done with browsers like Chrome/Edge/Firefox, but can be opened with old versions of Internet Explorer. Hosting the .xsl file online also doesn't seem to work. So, the **best** solution, yet lengthy ( on Chrome ) - 

1. Download the .xml and .xsl files listed here and add them to the same folder. Note the location of this folder.
2. Go to this link - https://chrome.google.com/webstore/detail/web-server-for-chrome/ofhbbkphhbklhfoeikjpcbhemlocgigb/related and install this extension. Launch the extension.
3. Click on "Choose Folder" and select the noted folder. This will launch a local server containing the folder.
4. Click on the URL below the "Choose Folder" (127.0.0.1:8887).
5. Click on the XML File. You'll see the XSL Formatted version of the XML File.

