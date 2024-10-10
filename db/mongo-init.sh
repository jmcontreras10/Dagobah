apt-get update -y
apt-get install nodejs -y
apt-get install npm -y
npm install
node init-mongo-data.js localhost:27018 mongodb://mongo:password@localhost:27018/dagobah