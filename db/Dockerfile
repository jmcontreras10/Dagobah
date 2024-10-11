FROM node:16-alpine
RUN mkdir -p /app/db
WORKDIR /app/db
COPY . /app/db
RUN npm install
ENTRYPOINT ["node", "./init-mongo-data.js", "mongodb://mongo:password@mongo:27017/dagobah"]