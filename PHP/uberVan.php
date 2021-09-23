<?php
require_once("car.php");
class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;


    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
      }

    public function setPassanger($passanger)
    {
      if ($passanger == 6) {
        $this -> passanger = $passanger;
      }

      else {
        echo "NEcesita asignar 6 pasajeros a UberVan";
      }
    }




}