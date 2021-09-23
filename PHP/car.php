<?php

class Car {
  public $id;
  public $license;
  public $driver;
  protected $passenger;

  public function __construct($license, $driver) {
    $this->license = $license;
    $this->driver = $driver;
  }

  public function PrintDataCar(){
    echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
  }


  public function getPassanger() {
    return $this -> passanger;
  }

  public function setPassanger($passanger) {
    if ($passanger == 4) {
      $this -> passanger = $passanger;
    }

    else {
      echo "Necesita asignar 4 pasajeros";
    }
  }
}