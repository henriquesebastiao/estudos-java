lint:
	google-java-format -i ./**/*.java --set-exit-if-changed
	yamlfmt -lint .
	mbake format --check Makefile

format:
	google-java-format -i ./**/*.java
	yamlfmt .
	mbake format Makefile

.PHONY: lint format