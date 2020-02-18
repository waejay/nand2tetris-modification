#!/bin/bash

find -name "*.java" > sources.txt
javac @sources.txt

package_class (){
	mkdir classes
	find -name "*.class" > sources.txt
	for file in $(cat sources.txt)
	do
		mv "$file" classes/
	done
	jar cf jar.jar classes/*
	rm -r classes
	rm sources.txt
}

cd HackPackageSource
package_class
cd ../
mv HackPackageSource/jar.jar InstallDir/bin/lib/Hack.jar

cd HackGUIPackageSource
package_class
cd ../
mv HackGUIPackageSource/jar.jar InstallDir/bin/lib/HackGUI.jar

cd CompilersPackageSource
package_class
cd ../
mv CompilersPackageSource/jar.jar InstallDir/bin/lib/Compilers.jar

cd SimulatorsPackageSource
package_class
cd ../
mv SimulatorsPackageSource/jar.jar InstallDir/bin/lib/Simulators.jar

cd SimulatorsGUIPackageSource
package_class
cd ../
mv SimulatorsGUIPackageSource/jar.jar InstallDir/bin/lib/SimulatorsGUI.jar

mv MainClassesSource/*.class InstallDir/bin/classes/
