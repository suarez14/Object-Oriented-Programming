<?php

require_once('car.php');
require_once('account.php');
require_once('uberVan.php');


$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();


$uberVan = new UberVan("OJL395", new Account("RAul","AND456"),"Nissan","Versa");
$uberVan -> setPassanger(6);
$uberVan -> PrintDataCar();