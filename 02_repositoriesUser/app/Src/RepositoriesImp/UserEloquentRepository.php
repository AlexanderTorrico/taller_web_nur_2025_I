<?php

namespace App\Src\RepositoriesImp;

use App\Models\User;
use App\Src\Model\UserModel;
use App\Src\Repositories\UserRepository;

class UserEloquentRepository implements UserRepository {

    public function getById(int $id) : UserModel {
        $user = User::find($id);

        return new UserModel(
            $user->id,
            $user->name,
            $user->email,
            $user->password
        );
        
    }

    public function store($name, $email, $password) : UserModel {
        $user = User::create([
            'name' => $name,
            'email' => $email,
            'password' => $password
        ]);
        
        return new UserModel(
            $user["id"],
            $user["name"],
            $user["email"]
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