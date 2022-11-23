cd /d %~dp0\
cd ..
docker build . --tag kursovaos -f Docker/Dockerfile
docker run --name=kursovaos -dp 8080:8080 kursovaos
cmd.exe
