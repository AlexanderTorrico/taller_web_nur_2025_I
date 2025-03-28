<?php

namespace App\Src\RepositoriesImp;

use App\Models\User;
use App\Src\Model\UserModel;
use App\Src\Repositories\UserRepository;

class UserStoregeRepository implements UserRepository {

    public function getById(int $id) : UserModel {

        return new UserModel(
            $id,
            "Test",
            "test@gmail.com",
            "12345678"
        );
        
    }

    public function store($name, $email, $password) : UserModel {
        return new UserModel(
            0,
            "Test",
            "test@gmail.com",
            "12345678"
        );
    }

    public function update($data, $id) : UserModel {
        $user = User::find($id);
        $user->update($data);
        return new UserModel(
            $user->id,
            $user->name,
            $user->email,
            $user->password
        );
    }

    public function delete($id) : bool {
        return User::destroy($id);
    }
}