sudo apt-get update
sudo apt install curl
curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
nvm install 16
nvm use 16
nvm alias default 16
npm install
node init-mongo-data.js localhost:27018 mongodb://mongo:password@localhost:27018/dagobah