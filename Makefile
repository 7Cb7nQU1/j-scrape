ifndef VERBOSE
.SILENT:
endif

compile:
	# Cleanup
	[ -d bin ] || mkdir bin
	rm -f ./bin/class/*.class
	rm -f ./bin/scrape.jar
	# Collect list of source files
	find ./src | grep -i .java | grep -i -v .swp > ./dat/filelist.txt
	# Compile class files
	javac -s bin/class -d bin/class @dat/filelist.txt
	# Archive the jar
	cd bin ;\
	cd class;\
	jar cvfm ../scrape.jar ../../dat/manifest.txt "./"
	# Make the jar executable
	chmod a+x ./bin/scrape.jar

