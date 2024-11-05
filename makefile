GRADLE = ./gradlew

.PHONY: build
build: 
	$(GRADLE) build

.PHONY: test
test:
	$(GRADLE) test

.PHONY: run
run: 
	$(GRADLE) run

.PHONY: clean
clean:
	$(GRADLE) clean