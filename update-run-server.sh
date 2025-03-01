#!/bin/bash

sudo apt update

git pull

docker-compose -f docker-compose-prod.yml --env-file .env.prod up