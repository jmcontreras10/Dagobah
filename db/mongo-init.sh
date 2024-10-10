#!/bin/bash

cd /app/db

npm install
node ./init-mongo-data.js mongodb://mongo:password@mongo:27017/dagobah