## Panduan Penggunaan

Unduh repository ke dalam komputer menggunakan perintah `git clone`. Url
repository dapat dilihat di dalam repository yang diinginkan.

```
git clone <url repository> <folder tujuan>
```

#### Contoh

```
user@host:~$ git clone https://github.com/ahmadsuherman/alpro2023_223040066 alpro2023_223040066
Cloning into 'alpro2023_223040066'...
remote: Counting objects: 4, done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 4 (delta 0), reused 4 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), done.
```

## Memperbarui Repository

Perbarui repository yang telah diunduh ke dalam komputer menggunakan perintah
`git pull`.

```
git pull origin <nama branch>
```

#### Contoh

```
git pull https://github.com/ahmadsuherman/alpro2023_223040066 main
From https://github.com/ahmadsuherman/alpro2023_223040066
 * branch            main     -> FETCH_HEAD
Already up-to-date.
```
