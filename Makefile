run:
	./gradlew run

test:
	./gradlew build test

stop:
	kill -9 `lsof -t -i:8080`

setup-mongo:
	docker-compose -f docker-compose-mongo.yaml up -d
	npm --prefix ./db install
	node ./db/init-mongo-data.js