<?php

namespace App\Src\Repositories;

use App\Src\Model\UserModel;

interface UserRepository {

    public function getById(int $id) : UserModel;

    public function store($name, $email, $password) : UserModel;

    public function update($data, $id) : UserModel;

    public function delete($id) : bool;
}